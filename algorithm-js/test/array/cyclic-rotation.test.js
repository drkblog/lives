import { rotate } from "../../src/array/cyclic-rotation";

test('normal rotation k=3', () => {
  const data = [3, 8, 9, 7, 6];
  expect(rotate(data, 3)).toStrictEqual([9, 7, 6, 3, 8]);
});

test('normal rotation k=4', () => {
  const data = [3, 8, 9, 7, 6];
  expect(rotate(data, 4)).toStrictEqual([8, 9, 7, 6, 3]);
});

test('identity rotation k=4', () => {
  const data = [1, 2, 3, 4];
  expect(rotate(data, 4)).toStrictEqual([1, 2, 3, 4]);
});

test('normal rotation k=2', () => {
  const data = [1, 2, 3, 4];
  expect(rotate(data, 2)).toStrictEqual([3, 4, 1 ,2]);
});