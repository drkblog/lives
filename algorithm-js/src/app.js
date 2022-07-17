import { benchmark } from './benchmark'
import { findDupQuad } from './time-complexity/quadratic'
import { findDupLinear } from './time-complexity/linear'

const small = [...Array(2000).keys()];
small.push(1999);
const medium = [...Array(4000).keys()];
medium.push(3999);
const large = [...Array(6000).keys()];
large.push(5999);

const TIMES = 1000;

benchmark(
  'quadratic-small',
  TIMES, 
  () => findDupQuad(small)
);
benchmark(
  'quadratic-medium', 
  TIMES, 
  () => findDupQuad(medium)
);
benchmark(
  'quadratic-large', 
  TIMES, 
  () => findDupQuad(large)
);


benchmark(
  'linear-small',
  TIMES,
  () => findDupLinear(small)
);
benchmark(
  'linear-medium', 
  TIMES, 
  () => findDupLinear(medium)
);
benchmark(
  'linear-large', 
  TIMES, 
  () => findDupLinear(large)
);