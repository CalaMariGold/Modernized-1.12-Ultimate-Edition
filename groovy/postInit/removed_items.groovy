// MODS_LOADED: jei

import mezz.jei.api.ingredients.VanillaTypes

log 'mod \'jei\' detected, running script'

/* Erebus */
mods.jei.ingredient.hide(VanillaTypes.ITEM, item('erebus:materials:43')) // copper ingot
mods.jei.ingredient.hide(VanillaTypes.ITEM, item('erebus:ore_copper'))

