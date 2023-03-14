// Q2. An arrow function takes two arguments firstName and lastName and returns a 2 letter string that represents the first letter of both the arguments.
// For the arguments Roger and Waters, the function returns ‘RW’. Write this function.

const func = (firstName, lastName) => {
  let result = firstName[0] + lastName[0];
  return result;
};

console.log(func("Roger", "Waters"));

// Output: RW

