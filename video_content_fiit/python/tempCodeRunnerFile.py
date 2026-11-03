import python.Internet_speedtest as Internet_speedtest

st = Internet_speedtest.Speedtest()
download = st.download() / 1000000

upload = st.upload() / 1000000



print(round(download, 2), "Mbps")
print(round(upload, 2), "Mbps")