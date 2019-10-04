/*
 * Copyright 2019 Jeremy Jamet / Kunzisoft.
 *     
 * This file is part of KeePass DX.
 *
 *  KeePass DX is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  KeePass DX is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with KeePass DX.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.kunzisoft.keepass.database.search

class SearchParametersV4 : SearchParameters {

    var searchInOther = true
    var searchInUUIDs = false
    var searchInTags = true

    constructor() : super()

    constructor(searchParametersV4: SearchParametersV4) : super(searchParametersV4) {
        this.searchInOther = searchParametersV4.searchInOther
        this.searchInUUIDs = searchParametersV4.searchInUUIDs
        this.searchInTags = searchParametersV4.searchInTags
    }

    override fun setupNone() {
        super.setupNone()
        searchInOther = false
        searchInUUIDs = false
        searchInTags = false
    }
}