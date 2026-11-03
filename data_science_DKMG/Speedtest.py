import speedtest

st = speedtest.Speedtest()


download = st.download() / 1000000

upload = st.upload() / 1000000


ping = st.results.ping


print(download, upload, ping)