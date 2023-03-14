// Q1. Write a program to demonstrate how a function can be passed as a parameter to another function.

function solve(x, y, add) {
  return add(x, y);
}
function add(x, y) {
  return x + y;
}
console.log("Sum is " + solve(4, 6, add));

// Output: Sum is 10

