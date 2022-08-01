export function rotate(data, k) {
  // Temporal: T3 + T4 (n+1) + T6 n -> O(n)
  // Espacial: O(n)
  const result = Array(data.length) // T3
  for (let i = 0; i < data.length; i++) { // T4 (n+1)
    // k=2 [1, 2, 3, 4] -> [3, 4, 1, 2]
    result[(i+k) % data.length] = data[i]; // T6 n
  }
  return result;
}

export function rotateNK(data, k) {
  // O(n * k)
  // O(1)
  for (let count = 0; count < k; count++) {
    rotateOne(data);
  }
  return data;
}

function rotateOne(data) {
  // [1, 2, 3, 4] -> [4, 1, 2, 3]
  let i = 1;
  let rec = data[0];
  while(i < data.length) {
    let tmp = data[i];
    data[i] = rec;
    rec = tmp;
    i++;
  }
  data[0] = rec;
}
