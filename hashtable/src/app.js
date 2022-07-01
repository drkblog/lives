class HashTable {
  constructor() {
    this.size = 1000;
    this.table = Array(this.size);
  }

  put(key, value) {
    const keyHash = this._hashString(key);
    const index = keyHash % this.size;
    if (this.table[index] === undefined) {
      this.table[index] = [];
    }
    this.table[index].push({ key: key, value: value });
  }

  get(key) {
    const keyHash = this._hashString(key);
    const index = keyHash % this.size;
    if (this.table[index] === undefined) {
      return undefined;
    }
    return this._lookUp(this.table[index], key);
  }

  _lookUp(bucket, key) {
    for (const item of bucket) {
      if (item.key === key) {
        return item.value;
      }
    }
    return undefined;
  }

  _hashString(stringKey) {
    let hash = 0, i, chr;
    if (stringKey.length === 0) return hash;
    for (i = 0; i < stringKey.length; i++) {
      chr = stringKey.charCodeAt(i);
      hash = ((hash << 5) - hash) + chr; 
      hash |= 0; // Convert to 32bit integer
    }
    return hash;
  }
}

module.exports = HashTable;