import { findRepeated } from "../../src/find-repeated/find-repeated";

test('repeated test 1', () => {
  const data = [8, 2, 4, 3, 5, 6, 7, 6, 1, 9];
  expect(findRepeated(data)).toBe(6);
});

test('repeated test 2', () => {
  const data = [1, 2, 3, 4, 5, 5, 6, 7, 8, 9];
  expect(findRepeated(data)).toBe(5);
});

test('repeated two items', () => {
  const data = [1, 1];
  expect(findRepeated(data)).toBe(1);
});

test('no repetition', () => {
  const data = [1, 2, 3, 4];
  expect(findRepeated(data)).toBe(-1);
});

test('empty', () => {
  const data = [];
  expect(findRepeated(data)).toBe(-1);
});

test('chars', () => {
  const data = ['s', 'g', 'z'];
  expect(findRepeated(data)).toBe(-1);
});

