import { isValid } from '../../src/parenthesis-matching/parenthesis-matching';

test('valid ()', () => {
  const formula = '1 + (3 * 5)';
  expect(isValid(formula)).toBe(true);
});

test('valid {{()}}', () => {
  const formula = '{x / [ 2 * x + (x * 2)]}';
  expect(isValid(formula)).toBe(true);
});

test('valid no parenthesis', () => {
  const formula = '1 + 3 * 1 * 5';
  expect(isValid(formula)).toBe(true);
});

test('invalid [(])', () => {
  const formula = '(1 + 3) * [ ( 1 * 5 ] )';
  expect(isValid(formula)).toBe(false);
});

test('invalid [', () => {
  const formula = '(1 + 3) * [ 1 * 5';
  expect(isValid(formula)).toBe(false);
});

test('invalid ]', () => {
  const formula = '(1 + 3) * 1 ] * 5';
  expect(isValid(formula)).toBe(false);
});
