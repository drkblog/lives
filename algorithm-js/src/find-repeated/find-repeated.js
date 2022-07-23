export function findRepeated(data) { 
  for (let i = 0; i < data.length - 1; i++) {
    if (data.includes(data[i], i+1)) {
      return data[i];
    }
  }
  return -1;
}

// Temporal O(n^2)


export function findRepeatedBetter(data) { 
  const present = Array(data.length);
  for (let i = 0; i < data.length; i++) {
    if (present[data[i]] === true) {
      return data[i];
    }
    present[data[i]] = true;
  }
  return -1;
}

// Temporal n => O(n)
// Espacial n => O(n)

export function findRepeatedBest(data) {
  for (let i = 0; i < data.length; i++) {
    const value = Math.abs(data[i]);
    if (data[value] < 0) {
      return value;
    }
    data[value] = data[value] * -1;
  }
  return -1;
}

// Temporal n => O(n)
// Espacial n => O(1)