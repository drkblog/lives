var path = require('path');

module.exports = {
  entry: './src/app.js',
  devtool: 'source-map',
  output: {
    path: path.resolve(__dirname),
    filename: './dist/app.js'
  }
};
