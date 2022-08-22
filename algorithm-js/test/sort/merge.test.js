import { sort } from "../../src/sort/merge";

test('normal even', () => {
  const data = [3, 8, 9, 7, 6, 1];
  expect(sort(data)).toStrictEqual([1, 3, 6, 7, 8, 9]);
});

test('normal odd', () => {
  const data = [3, 8, 9, 7, 6];
  expect(sort(data)).toStrictEqual([3, 6, 7, 8, 9]);
});

test('repeated', () => {
  const data = [3,4,1,1,7,9,7];
  expect(sort(data)).toStrictEqual([1,1,3,4,7,7,9]);
});
