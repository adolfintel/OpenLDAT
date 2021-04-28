/*
 * Copyright (C) 2021 Federico Dossena
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.dosse.openldat.tests.testscreen;

/**
 *
 * @author dosse
 */
public interface ITestScreen {
    
    public abstract void flashColor(float r, float g, float b, double ms);

    public abstract boolean setColor(float r, float g, float b);

    public abstract void setTarget(float x, float y, float size, boolean black);

    public abstract void setTargetAbsolute(float x, float y, float size, boolean black);

    public abstract void hideTarget();

    public abstract int getScreenW();

    public abstract int getScreenH();

    public abstract void setFlashOnClick(boolean flashOnClick);

    public abstract void setFlicker(boolean bkFlicker);

    public abstract boolean getFlashOnClick();

    public abstract boolean isFlickering();

    public abstract void setFakeLoad(long cpuMs, long gpuMs);

    public abstract long getFakeCPULoad();

    public abstract long getFakeGPULoad();

    public abstract void close();

    public abstract void onEnterPressed();

    public abstract void onCancel();

    public abstract void onError(Exception e);

    public abstract int getRefreshRate();
}
