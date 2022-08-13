export function maxCounters(counters, instructions) {
  const counter = Array(counters);
  for (let i = 0; i < instructions.length; i++) {
    if (instructions[i] <= counters) {
      counter[instructions[i] - 1]++;
    } else if (instructions[i] == counters + 1) {
      let max = 0;
      for (let j = 0; j < counter.length; j++) {
        if (counter[j] > max) {
          max = counter[j];
        }
      }
      for (let j = 0; j < counter.length; j++) {
        counter[j] = max;
      }
    } else {
      throw Error('Invalid input');
    }
  }
  return counter;
}