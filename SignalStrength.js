signal = require('react-native').NativeModules.RNSignalStrength;

module.exports = {
  getConstant: function () {
    return signal.hello;
  },
};
