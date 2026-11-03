import speedtest 


st = speedtest.Speedtest()


download = st.download() / 1000000

upload = st.upload() / 1000000


print("Download", round(download, 2), "mbps")
print("Upload", round(upload, 2), "mbps")