NDeviceInfo = require('react-native').NativeModules.RNSignalStrength;

module.exports = {
  getConstant: function () {
    return RNSignalStrength.hello;
  },
};
