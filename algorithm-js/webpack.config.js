import path from 'path';

const configuration = {
  entry: './src/app.js',
  output: {
    path: path.resolve(__dirname),
    filename: './dist/app.js'
  }
};

export default configuration;