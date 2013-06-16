/*
 *  Copyright (c) 2012 Malhar, Inc.
 *  All Rights Reserved.
 *
*/

/**
 * Execution layer for data operators, tuple processing, serialization, streams, window boundaries etc.<p>
 * <br>
 * <br>
 * The streaming platform would take care of the following for you<br>(TBD, add "How it will")<br>
 * - Standard partitioning (round robin, sticky key). You can add  your own partitioning.<br>
 * - End of window statistics collection in terms of number of tuples, bandwidth, I/O etc<br>
 * - Ensuring the the emitted tuple reaches the downstream operators<br>
 * - Queueing tuples and retaining them till all future downstream operators have consumed it<br>
 * <br>
 * <br>
 * There are pre-defined library operators that you can use: see ...<br>
 * Examples are in the following packages<br>
    <ul>
      <li><a href="../../../malhartech/lib/algo/package-summary.html">Algorithmic</a>: A set of algorithmic operators</li>
      <li><a href="../../../malhartech/lib/io/package-summary.html">Input-Output</a>: A set of operators for Input-Output from Hadoop. Consists of adapters to various message buses</li>
      <li><a href="../../../malhartech/lib/logs/package-summary.html">Log Collection</a>: A set of operators for log collection</li>
      <li><a href="../../../malhartech/lib/math/package-summary.html">Arithmetic</a>: A set of arithmetic operators</li>
      <li><a href="../../../malhartech/lib/stream/package-summary.html">Stream</a>: A set of operators for stream operations</li>
      <li><a href="../../../malhartech/lib/testbench/package-summary.html">Testbench</a>: A set of operators for testing your dag, operators </li>
      <li><a href="../../../malhartech/lib/util/package-summary.html">Utilities</a>: A set of utility classes</li>
    </ul>
 * <br>
 *
 */

package com.datatorrent.engine;


