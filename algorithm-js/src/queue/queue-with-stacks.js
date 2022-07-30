export class Queue {
  constructor() {
    this.stackIn = [];
    this.stackOut = [];
  }

  append(value) {
    this.stackIn.push(value);
  }

  #swapStacks() {
    if (this.stackOut.length === 0) {
      let nextValue = this.stackIn.pop();
      while(nextValue !== undefined) {
        this.stackOut.push(nextValue);
        nextValue = this.stackIn.pop();
      }
    }
  }

  peek() {
    this.#swapStacks();
    return this.stackOut.at(this.stackOut.length - 1);
  }

  next() {
    this.#swapStacks();
    return this.stackOut.pop();
  }
}