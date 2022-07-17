export function findDupQuad(data) {
  for (let i = 0; i < data.length - 1; i++) {
    for (let j = i + 1; j < data.length; j++) {
      if (data[i] == data[j]) {
        return data[i];
      }
    }
  }
}

// Temporal O(n^2)
// Espacial O(1)