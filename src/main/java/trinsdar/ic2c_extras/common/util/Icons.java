package trinsdar.ic2c_extras.common.util;

import ic2.core.platform.textures.Ic2Icons;
import ic2.core.platform.textures.Sprites;

import static ic2.core.platform.textures.Ic2Icons.*;

public class Icons
{

    public static void loadSprites(Ic2Icons ic2Icons)
    {
        addSprite(new Sprites.SpriteData("ic2c_extras_blocks", "ic2c_extras:textures/sprites/blocks.png", new Sprites.SpriteInfo(16, 16)));
        addSprite(new Sprites.SpriteData("ic2c_extras_items", "ic2c_extras:textures/sprites/items.png", new Sprites.SpriteInfo(16, 16)));
        addTextureEntry(new Sprites.TextureEntry("ic2c_extras_blocks", 0, 0, 12, 1));
        addTextureEntry(new Sprites.TextureEntry("ic2c_extras_items", 0, 0, 7, 2));
        addTextureEntry(new Sprites.TextureEntry("ic2c_extras_items", 0, 2, 11, 3));
        addTextureEntry(new Sprites.TextureEntry("ic2c_extras_items", 0, 3, 9, 4));
    }
}
