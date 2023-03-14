/* Assume we are fetching the data from a rest endpoint in the get data function. 
we can simulate the same by replacing the setTimeout with fetch api and executing the same in a browser.

function getData(uId) {
  setTimeout(() => {
    console.log("Fetched the data!");
    return "skc@gmail.com";
  }, 4000);
}

console.log("start");
var email = getData("skc");
console.log("Email id of the user id is: " + email);
console.log("end");

How do you solve this problem. How can we wait for till the function execution is completed, so that we can have correct email at line 13? */

async function solve(uId) {
  let promise = new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("Fetched the data!");
      resolve(uId + "@gmail.com");
    }, 4000);
  });
  return promise;
}

async function getData(uId) {
  console.log("start");
  let email = await solve(uId);
  console.log("Email id of the user id is: " + email);
  console.log("end");
}

getData("skc");

