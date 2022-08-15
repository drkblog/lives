import { finsSubarray } from "../../src/array/subarray-sum-zero";

test('case 1', () => {
  const data = [4, 2, -3, 1, 6];
  expect(finsSubarray(data)).toStrictEqual([1, 3]);
});

test('case alt', () => {
  const data = [1, 2, -3, 8];
  expect(finsSubarray(data)).toStrictEqual([0, 2]);
});

test('case 2', () => {
  const data = [-1, 2, -3, 4, -4, 3, -2, 1];
  expect(finsSubarray(data)).toStrictEqual([3, 4]);
});

test('case null', () => {
  const data = [20, 30, 40, 10];
  expect(finsSubarray(data)).toBeNull();
});