import { sort } from "../../src/sort/counting";

test('normal', () => {
  const data = [3, 8, 9, 7, 6];
  expect(sort(data)).toStrictEqual([3, 6, 7, 8, 9]);
});

test('repeated', () => {
  const data = [9, 3, 8, 9, 7, 6, 9];
  expect(sort(data)).toStrictEqual([3, 6, 7, 8, 9, 9, 9]);
});