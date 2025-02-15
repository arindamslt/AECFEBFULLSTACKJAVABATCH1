//SPREAD OPERATOR
//COPY DATA FROM ONE OBJECT TO ANOTHER OBJECT
var obj1={
    id:101,
    nm:'ARUP',
    dept:'HR'
}
var obj2={
    ...obj1,
    dept:'FINANCE'
}
console.log(obj1);
console.log(obj2);
//REST PARAMETER
function fn1(x,y,...data)
{
    console.log(x,y,data);
}
fn1(10,20);
fn1(10,20,30,40);
//DETSRUCTING THE OBJECT
var obj3={
    id:102,
    nm:'ALOKE',
    phno:'344334'
}
var{nm,phno}=obj3;
console.log(nm);
console.log(phno);
//ARROW FUNCTION
/*function fn()
{
    console.log("CONCRETE FUNCTION");
}*/
const fn=()=>{
    console.log("CONCRETE FUNCTION");
}
fn();
var arr=[100,200,300,400];
arr.forEach(function(element,index){
    console.log(index,element);
    })
    arr.forEach((element,index)=>{
        console.log(index,element);  
    })
//VAR VS LET VS CONST
/*function test()
{
    if(true)
    {
        var x=25;
        console.log(x);
    }
    console.log(x);
}*/
/*function test()
{
    if(true)
    {
        let x=25;
        console.log(x);
    }
    console.log(x);
}*/
function test()
{
    if(true)
    {
        const x=25;
        console.log(x);
        x=40;
    }
    
}
test();