# API
```
//Get
http://localhost:8080/polls
//Post
*http://localhost:8080/polls
{
"question": "Who will win SuperBowl this year?",
"options": [
{"value": "New England Patriots"},
{"value": "Seattle SeAhawks"},
{"value": "Green Bay Packers"},
{"value": "Denver Broncos"}]
}
//Put
{
"question": "Who will win SuperBowl this year?",
"options": [
{"value": "New England Patriots"},
{"value": "Seattle Seahawks"},
{"value": "Green Bay Packers"},
{"value": "Denver Broncos"}]
}
//Cast a Vote
{
    "option" : {"id":5, "value":"New England Patriots"}
}
//Count a Vote 
http://localhost:8080/computeresult?pollId=6

//Getting a poll that does not exist
*http://localhost:8080/polls/100

//Posting a poll with a missing poll question
*http://localhost:8080/polls
{
    "option": [
        {"value" : "New England Patriots"},
        {"value" : "Seattle Seahawks"},
        {"value" : "Green Bay Packers"},
        {"value" : "Denver Broncos"}]
}

//An attempt to post with bad json data ( eg: missing curly bracket or coma in json)
*http://localhost:8080/polls
{
    "option": [
        {"value" : "New England Patriots"},
        {"value" : "Seattle Seahawks"}
        {"value" : "Green Bay Packers"},
        {"value" : "Denver Broncos"}]
}
