package com.dlsc.formsfx.view.renderer;

/*-
 * ========================LICENSE_START=================================
 * FormsFX
 * %%
 * Copyright (C) 2017 DLSC Software & Consulting
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */

import com.dlsc.formsfx.model.structure.Group;
import javafx.geometry.Insets;

/**
 * This class renders a group for a form.
 *
 * @author Sacha Schmid
 * @author Rinesch Murugathas
 */
public class GroupRenderer extends GroupRendererBase {
    
    protected int hSpacing = 0;
    protected int vSpacing = 0;
    protected int hTopPad = 0;
    protected int hBotPad = 0;
    protected int vRPad = 0;
    protected int vLPad = 0;
    
    /**
     * This is the constructor to pass over data.
     *
     * @param group
     *              The section which gets rendered.
     */
    protected GroupRenderer(Group group) {
        this.element = group;
        init();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeParts() {
        super.initializeParts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void layoutParts() {
        super.layoutParts();

        getStyleClass().add("formsfx-group");

        setFocusTraversable(false);
    //    setPadding(new Insets(hSpacing * 10));
        getChildren().add(grid);
    }
    
    public void setSpacing(int hSpacing, int vSpacing) {
        this.hSpacing = hSpacing;
        this.vSpacing = vSpacing;
    }
    
    public void setPadding(int vLPad, int hTopPad, int vRPad, int hBotPad) {
        this.vLPad = vLPad;
        this.vRPad = vRPad;
        this.hTopPad = hTopPad;
        this.hBotPad = hBotPad;
    }

}
