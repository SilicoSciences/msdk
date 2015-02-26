/* 
 * (C) Copyright 2015 by MSDK Development Team
 *
 * This software is dual-licensed under either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */

package io.github.msdk.datamodel.peaklists;

import java.util.List;

import javax.annotation.Nonnull;

/**
 * 
 */
public interface IPeakListRow {

    /**
     * @return
     */
    @Nonnull
    IPeakList getParentPeakList();

    /**
     * Returns ID of this row
     */
    int getId();

    /**
     * Returns number of peaks assigned to this row
     */
    int getNumberOfColumns();

    /**
     * Return peaks assigned to this row
     */
    <DataType> List<IPeakListColumn<DataType>> getColumns();

    /**
     * 
     */
    <DataType> DataType getData(IPeakListColumn<DataType> column);

}