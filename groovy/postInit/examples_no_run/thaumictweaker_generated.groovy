// no_run

// Auto generated groovyscript example file
// MODS_LOADED: thaumictweaker

log 'mod \'thaumictweaker\' detected, running script'

// Thaumcraft Pech Trades:
// Pech Trades are a trading mechanic added by Thaumcraft. Pech trades involve giving a Pech an item and randomly
// generating a selection of loot based on the value of the item traded. Due to a limitation in Thaumcraft, Pechs must have
// at least one registered trade for each trade level (1 - 5). ThaumicTweaker automatically re-populates any missing trades
// with scrap items.

mods.thaumictweaker.pech_trades.removeTrade('ARCHER', item('minecraft:compass'))
mods.thaumictweaker.pech_trades.removeTrade('MINER', item('minecraft:blaze_rod'))
mods.thaumictweaker.pech_trades.removeTrade('MAGE', item('minecraft:experience_bottle'))
// mods.thaumictweaker.pech_trades.removeAllTrades('MINER')
// mods.thaumictweaker.pech_trades.removeAllTrades()

mods.thaumictweaker.pech_trades.recipeBuilder()
    .setPechType('MINER')
    .setTradeLevel(1)
    .setTradeItem(item('minecraft:diamond'))
    .register()


mods.thaumictweaker.pech_trades.addTrade('MAGE', 1, item('minecraft:diamond'))
mods.thaumictweaker.pech_trades.addTrade('MINER', 1, item('minecraft:diamond'))
mods.thaumictweaker.pech_trades.addTrade('ARCHER', 1, item('minecraft:diamond'))
mods.thaumictweaker.pech_trades.addTrade('COMMON', 1, item('minecraft:diamond'))
mods.thaumictweaker.pech_trades.addValuedItem(item('minecraft:ender_pearl'), 15)

// Porous Stone Special Drops:
// Add or remove non-gravel Porous Stone special item drops.

mods.thaumictweaker.porous_stone.removeDrop(item('thaumcraft:cluster:*'))
mods.thaumictweaker.porous_stone.removeDrop(item('thaumcraft:crystal_essence'))

mods.thaumictweaker.porous_stone.addDrop(item('minecraft:clay'), 5)

// Special Mining Results:
// Special Mining Results are special drops obtained when mining ores with tools with the Refining infusion enchantment.

mods.thaumictweaker.special_mining_result.removeByHarvestDrop(ore('oreIron'))
mods.thaumictweaker.special_mining_result.removeByOutput(item('thaumcraft:cluster:0'))

mods.thaumictweaker.special_mining_result.recipeBuilder()
    .setHarvestDrop(item('minecraft:iron_ore'))
    .setResult(item('thaumcraft:cluster:0'))
    .setChance(1.0)
    .register()


mods.thaumictweaker.special_mining_result.add(ore('oreIron'), item('thaumcraft:cluster:0'), 1.0)
mods.thaumictweaker.special_mining_result.add(ore('gemQuartz'), item('thaumcraft:cluster:7'), 1.0)

// Thaumic Tweaker Utils:
// Several utility methods used to make handling some Thaumcraft stuff easier.

mods.thaumictweaker.utils.getVisCrystal(aspect('ignis'))
mods.thaumictweaker.utils.getVisCrystal(aspect('ignis') * 100)
mods.thaumictweaker.utils.getAspectPhial(aspect('ignis'))

mods.thaumictweaker.utils.addCollapsingRiftDrop(item('minecraft:diamond'), 100, 0.8)
