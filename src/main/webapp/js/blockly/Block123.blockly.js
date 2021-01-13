window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Block123 = window.blockly.js.blockly.Block123 || {};

/**
 * Block123
 */
window.blockly.js.blockly.Block123.Execute = async function() {

  return await this.cronapi.calendar.getCalendarValue("");
}
