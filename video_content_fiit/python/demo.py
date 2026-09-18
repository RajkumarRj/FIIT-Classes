from PIL import Image

image_paths = [
    "page1.jpeg",
    "page2.jpeg",
    "page3.jpeg",
    "page4.jpeg"
]


images = [Image.open(path).convert("RGB")
          for path in image_paths]


images[0].save(
    "combined.pdf",
    save_all = True,
    append_images = images[1:]
)