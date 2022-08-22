export function sort(values) {
  sortInPlace(values, 0, values.length);
  return values;
}
function sortInPlace(values, start, end) {
  // Merge sort
  // Twitch: @drkbugs
  // Instagram: drk.com.ar
  if (end - start <= 1) {
    return;
  }
  // [1,2,3,4,5,6,7,8]
  const middle = Math.floor((end - start) / 2 + start);
  sortInPlace(values, start, middle);
  sortInPlace(values, middle, end);

  const backup = values.slice(start, middle);

  let ia = 0;
  let ib = middle;
  let i = start;
  while(i < end) {
    if (start + ia >= middle) {
      // values[i] = values[ib];
      // ib++;
      break;
    } else if (ib >= end) {
      values[i] = backup[ia];
      ia++;
    } else if (backup[ia] > values[ib]) {
      values[i] = values[ib];
      ib++;
    } else {
      values[i] = backup[ia];
      ia++;
    }
    i++;
  }
}

function sortCopies(values) {
  const length = values.length;
  if (length == 1) {
    return values;
  }
  const middle = Math.floor(length/2);
  const a = sort(values.slice(0, middle));
  const b = sort(values.slice(middle));
  let i = 0;
  const sorted = new Array(length);
  while(a.length > 0 || b.length > 0) {
    if (a.length == 0) {
      sorted[i] = b.shift();
    } else if (b.length == 0) {
      sorted[i] = a.shift();
    } else if (a[0] < b[0]) {
      sorted[i] = a.shift();
    } else {
      sorted[i] = b.shift();
    }
    i++;
  }
  return sorted;
}