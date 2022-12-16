from fastapi import FastAPI
from pydantic import BaseModel
from pymongo import MongoClient
from bson.objectid import ObjectId

app = FastAPI()
client = MongoClient("mongodb://localhost:27017/")

mydatabase = client.pymongo_testing
mycollection = mydatabase.myTable

class info(BaseModel):
    name:str
    age:int
    mail_id:str

@app.get("/read/{id}")
def read_docs(id:str):
    doc=mycollection.find_one({"_id":ObjectId(id)})
    return str(doc)

@app.post("/create")
def create_docs(payload: info):
    info_=payload.dict()
    x = mycollection.insert_one(info_)
    return str(x.inserted_id)
