res='''https://teams.microsoft.com/l/meetup-join/19%3ameeting_Njg3YzVmM2MtZDFlYi00NWMyLThlZTgtZjE2NmI4YWI0ZjFl%40thread.v2
/0?context=%7b%22Tid%22%3a%22051d4f64-7fe1-4d7f-8e54-73f29a33cc48%22%2c%22Oid%22%3a%22facb2818-cb0e-4b69-8b44-ad1d64979b47%22%7d'''
fin="meeting_NTcxMzIwYWUtNDgyOC00OTYwLTkxZDUtMmFiNGNjMWU1YWMx@thread.v2"
res2='''https://teams.microsoft.com/l/meetup-join/19:meeting_NTcxMzIwYWUtNDgyOC00OTYwLTkxZDUtMmFiNGNjMWU1YWMx@thread.v2/0?context=%7B%22Tid%22:%22051d4f64-7fe1-4d7f-8e54-73f29a33cc48%22,%22Oid%22:%222c7d5e07-4134-4009-b780-4fce1e81f643%22%7D&email_id=developer@recosenselabs.com'''
res3='''https://teams.microsoft.com/l/meetup-join/19%3ameeting_Njg3YzVmM2MtZDFlYi00NWMyLThlZTgtZjE2NmI4YWI0ZjFl%40thread.v2/0?context=%7b%22Tid%22%3a%22051d4f64-7fe1-4d7f-8e54-73f29a33cc48%22%2c%22Oid%22%3a%22facb2818-cb0e-4b69-8b44-ad1d64979b47%22%7d'''
res4="https://teams.microsoft.com/l/meetup-join/19:meeting_MjcxZmY2M2QtNzk5ZS00MWJlLTk3N2YtN[…]%22,%22Oid%22:%22facb2818-cb0e-4b69-8b44-ad1d64979b47%22%7D"


res5="https://teams.microsoft.com/l/meetup-join/19:meeting_M2U2ZDQ1MGYtMjcwMC00ZTI4LWExYzgtZmY5MGE1Y2JmOTk3@thread.v2/0"


print(res5.split("/")[5].replace("%3a",":").replace("%40","@"))