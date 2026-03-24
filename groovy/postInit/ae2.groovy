// MODS_LOADED: appliedenergistics2

import mezz.jei.api.ingredients.VanillaTypes
import appeng.capabilities.Capabilities

log 'mod \'appliedenergistics2\' detected, running script'


//mods.jei.description.remove(item('appliedenergistics2:material:15'))
//mods.jei.description.remove(item('appliedenergistics2:material:13'))
//mods.jei.description.remove(item('appliedenergistics2:material:14'))

mods.jei.description.add(item('appliedenergistics2:material:15'), ['AE2 meteors no longer spawn in the overworld. Instead, skystone can be obtained from Hyxcate meteorites, which can be located with a §dMeteor Detector§r.'])
mods.jei.description.add(item('appliedenergistics2:material:13'), ['AE2 meteors no longer spawn in the overworld. Instead, skystone can be obtained from Hyxcate meteorites, which can be located with a §dMeteor Detector§r.'])
mods.jei.description.add(item('appliedenergistics2:material:14'), ['AE2 meteors no longer spawn in the overworld. Instead, skystone can be obtained from Hyxcate meteorites, which can be located with a §dMeteor Detector§r.'])
mods.jei.description.add(item('appliedenergistics2:material:45'), ['AE2 meteors no longer spawn in the overworld. Instead, skystone can be obtained from Hyxcate meteorites, which can be located with a §dMeteor Detector§r.'])
mods.jei.description.add(item('appliedenergistics2:sky_stone_block'), ['AE2 meteors no longer spawn in the overworld. Instead, skystone can be obtained from Hyxcate meteorites, which can be located with a §dMeteor Detector§r.'])


// Inscriber Logic Press
crafting.shapedBuilder()
    .output(item('appliedenergistics2:material:15'))
    .row('   ')
    .row('MMM')
    .row('SSS')
    .key('S', item('appliedenergistics2:material:45'))
    .key('M', item('nyx:meteorite_ingot'))
    .register()

// Inscriber Calculation Press
crafting.shapedBuilder()
    .output(item('appliedenergistics2:material:13'))
    .row('SMS')
    .row('M M')
    .row('SMS')
    .key('S', item('appliedenergistics2:material:45'))
    .key('M', item('nyx:meteorite_ingot'))
    .register()

// Inscriber Engineering Press
crafting.shapedBuilder()
    .output(item('appliedenergistics2:material:14'))
    .row('MSM')
    .row('S S')
    .row('MSM')
    .key('S', item('appliedenergistics2:material:45'))
    .key('M', item('nyx:meteorite_ingot'))
    .register()
