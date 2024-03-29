package com.github.funthomas424242.midi.builder;

/*-
 * #%L
 * rades-example Example
 * %%
 * Copyright (C) 2018 - 2019 PIUG
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


class MidiFluentBuilderTest {

    MidiFluentBuilder midiFluentBuilder;

    @BeforeEach
    void setUpTestfall() {
        midiFluentBuilder = new MidiFluentBuilder();
    }


    @Test
    void defaultInstanceNotNull() {
        assertNotNull(midiFluentBuilder);
    }


    @Test
    void gueltigerTaktVierViertel() {
        final Takt takt = Takt.of(Note.of())
    }


}
