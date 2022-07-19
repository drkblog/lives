import { isValid } from '../../src/parenthesis-matching/parenthesis-matching';

test('valid', () => {
  const formula = '1 + (3 * 5)';
  expect(isValid(formula)).toBe(true);
});