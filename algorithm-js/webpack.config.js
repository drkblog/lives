let path = require('path');

module.exports = {
  entry: './src/app.js',
  output: {
    path: path.resolve(__dirname),
    filename: './dist/app.js'
  }
};