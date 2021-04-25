package alluxio.stress.worker;

import alluxio.stress.Parameters;

import com.beust.jcommander.DynamicParameter;
import com.beust.jcommander.Parameter;

import java.util.HashMap;
import java.util.Map;

/**
 * Parameters used in the UFS I/O throughput test.
 * */
public class RpcParameters extends Parameters {
  @Parameter(names = {"--concurrency"},
          description = "this many workers on one machine")
  public int mConcurrency = 2;

  @Parameter(names = {"--block-count"},
          description = "fake this many blocks")
  public long mBlockCount = 100;

  @Parameter(names = {"--duration"},
          description = "The length of time to run the benchmark. (1m, 10m, 60s, 10000ms, etc.)")
  public String mDuration = "30s";

  @Parameter(names = {"--rpc"},
          description = "The RPC to simulate")
  public String mRpc = "registerWorker";

}

