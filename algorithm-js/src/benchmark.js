export function benchmark(label, times, runnable) {
  const start = new Date().getTime();
  for (let i = 0; i < times; i++) {
    runnable();
  }
  const end = new Date().getTime();
  console.log(`${label} took ${end - start} ms`);
}