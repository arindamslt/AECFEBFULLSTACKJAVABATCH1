//NORMAL FUNCTION
function fn1()
{
    console.log("NORMAL FUNCTION");
}
fn1();
//PARAMETERISED FUNCTION
function fn2(x,y)
{
    console.log(x,y);
}
fn2(10,20);
//FUNCTION WITH RETURN STATEMEMT
function fn3(x,y)
{
    return(x+y);
}
var result=fn3(10,20);
console.log("RESULT:"+result);
//ANNONYMOUS FUNCTION  FUNCTION WITHOUT NAME
function fn4(f)
{
    console.log(f);
    f();
}
fn4(function(){
    var city='KOLKATA';
    console.log(city);
})
//CALLBACK AND HIGHER ORDER FUNCTION
function print()
{
    var state='WEST BENGAL';
    console.log("STATE:"+state);
}
function fn5(f)
{
    console.log(f);
    f();
}
fn5(print);
//FUNCTION EXPRESSION
var res=function(){
    var nm='ARUP';
    console.log("NAME:"+nm);
}
res();