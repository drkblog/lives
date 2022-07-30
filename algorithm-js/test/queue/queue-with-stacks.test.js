import { Queue } from '../../src/queue/queue-with-stacks';

test('basic', () => {
  const queue = new Queue();
  queue.append(1);
  queue.append(2);
  queue.append(3);
  queue.append(4);
  queue.peek();
  queue.next();
  expect(queue.next()).toBe(2);
});

test('basic', () => {
  const queue = new Queue();
  queue.append(1);
  queue.append(2);
  queue.append(3);
  queue.append(4);
  queue.next();
  queue.next();
  queue.append(5);
  queue.append(6);
  queue.next();
  queue.next();
  expect(queue.next()).toBe(5);
});
