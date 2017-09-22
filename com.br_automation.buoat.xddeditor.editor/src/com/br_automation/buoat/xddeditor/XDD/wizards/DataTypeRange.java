/*******************************************************************************
 * @file   DataTypeRange.java
 *
 * @author Sree Hari Vignesh, Kalycito Infotech Private Limited.
 *
 * @copyright (c) 2017, Kalycito Infotech Private Limited
 *                    All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *   * Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   * Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *   * Neither the name of the copyright holders nor the
 *     names of its contributors may be used to endorse or promote products
 *     derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL COPYRIGHT HOLDERS BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *******************************************************************************/

package com.br_automation.buoat.xddeditor.XDD.wizards;

public interface DataTypeRange {
    public static long Boolean_min = 0;
    public static long Boolean_max = 1;
    public static long Integer8_min = -256;
    public static long Integer8_max = 255L;
    public static long Integer16_min = -65536L;
    public static long Integer16_max = 65535L;
    public static long Integer32_min = -4294967296L;
    public static long Integer32_max = 4294967295L;
    public static long Unsigned8_min = 0;
    public static long Unsigned8_max = 255L;
    public static long Unsigned16_min = 0;
    public static long Unsigned16_max = 65535L;
    public static long Unsigned32_min = -4294967296L;
    public static long Unsigned32_max = 4294967295L;
    public static long Integer24_min = -8388608L;
    public static long Integer24_max = 8388607L;
    public static long Integer40_min = -549755813888L;
    public static long Integer40_max = 549755813887L;
    public static long Integer48_min = -140737488355328L;
    public static long Integer48_max = 140737488355327L;
    public static long Integer56_min = -36028797018963968L;
    public static long Integer56_max = 36028797018963967L;
    public static long Integer64_min = -9223372036854775808L;
    public static long Integer64_max = 9223372036854775807L;
    public static long Unsigned24_min = 0;
    public static long Unsigned24_max = 16777215L;
    public static long Unsigned40_min = 0;
    public static long Unsigned40_max = 1099511627775L;
    public static long Unsigned48_min = 0;
    public static long Unsigned48_max = 281474976710655L;
    public static long Unsigned56_min = 0;
    public static long Unsigned56_max = 72057594037927935L;
    public static long Unsigned64_min = 0;
    public static long Unsigned64_max = Long.MAX_VALUE;
    public static double Real32_min = 1.2E-38;
    public static double Real32_max = 3.4E+38;
    public static double Real64_min = 2.3E-308;
    public static double Real64_max = 1.7E+308;
}
