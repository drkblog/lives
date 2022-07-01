const HashTable = require('../src/app');

test('get', () => {
  const key = 5;
  const value = 'Value';
  const hashtable = new HashTable();
  hashtable.put(key, value);
  expect(hashtable.get(key)).toBe(value);
});

test('put(1) and put(1001)', () => {
  const key1 = 1;
  const key2 = 1001;
  const value1 = 'Value1';
  const value2 = 'Value2';
  const hashtable = new HashTable();
  hashtable.put(key1, value1);
  hashtable.put(key2, value2);
  expect(hashtable.get(key1)).toBe(value1);
  expect(hashtable.get(key2)).toBe(value2);
});

test('put(a) and put(b)', () => {
  const key1 = 'unaKey';
  const key2 = 'otraKey';
  const value1 = 'unValor';
  const value2 = 'otroValor';
  const hashtable = new HashTable();
  hashtable.put(key1, value1);
  hashtable.put(key2, value2);
  expect(hashtable.get(key1)).toBe(value1);
  expect(hashtable.get(key2)).toBe(value2);
});
