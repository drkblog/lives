export function findDupLinear(data) {
  const set = Array(data.length);
  for (let i = 0; i < data.length; i++) {
    if (set[data[i]] === true) {
      return data[i];
    }
    set[data[i]] = true;
  }
}

// Temporal O(n)
// Espacial O(n)
