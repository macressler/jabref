package org.jabref.gui;

import de.jensd.fx.glyphs.GlyphIcons;

/**
 * Provides the same true-type font interface as MaterialDesignIcon itself, but uses a font we created ourselves that
 * contains icons that are not available in MaterialDesignIcons.
 *
 * @implNote The glyphs of the ttf (speak: the icons) were created with Illustrator and a template from the material design icons
 * web-page. The art boards for each icon was exported as SVG and then converted with glypher.com. The final TTF font is
 * located in the resource folder.
 *
 * {@see /jabref/src/main/resources/fonts/JabRefMaterialDesign.ttf}
 * {@see https://materialdesignicons.com/custom}
 */
public enum JabRefMaterialDesignIcon implements GlyphIcons {

    VIM("\u0041"),
    TEX_STUDIO("\u0042"),
    TEX_MAKER("\u0043"),
    OPEN_OFFICE("\u0044"),
    LYX("\u0045"),
    EMACS("\u0046"),
    ARXIV("\u0047");

    private final String unicode;

    JabRefMaterialDesignIcon(String unicode) {
        this.unicode = unicode;
    }

    @Override
    public String unicode() {
        return unicode;
    }

    @Override
    public String fontFamily() {
        return "\'JabRefMaterialDesign\'";
    }
}
