/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  if (x < 0) {
    return false;
  } else {
    return check(getDigitsArr(x));
  }
};

function getDigitsArr(x) {
  const arrOfDigits = [];
  if (x >= 0 && x <= 9) {
    arrOfDigits.push(x);
  } else {
    while (x > 0) {
      arrOfDigits.push(x % 10);
      x = Math.floor(x / 10);
    }
  }
  return arrOfDigits;
}

function check(arr) {
  let result = true;
  for (let i = 0, j = arr.length - 1; i <= arr.length / 2 && result; i++, j--) {
    if (arr[i] !== arr[j]) {
      result = false;
    }
  }
  return result;
}
