package tss.tpm;

import tss.*;


// -----------This is an auto-generated file: do not edit

//>>>

/**
 *  Custom data structure representing an empty element (i.e. the one with 
 *  no data to marshal) for selector algorithm TPM_ALG_NULL for the union TPMU_ASYM_SCHEME
 */
public class TPMS_NULL_ASYM_SCHEME extends TPMS_NULL_UNION
{
    public TPMS_NULL_ASYM_SCHEME() {}
    
    @Override
    public byte[] toTpm() 
    {
        OutByteBuf buf = new OutByteBuf();
        toTpm(buf);
        return buf.getBuf();
    }

    public static TPMS_NULL_ASYM_SCHEME fromTpm (byte[] x) 
    {
        TPMS_NULL_ASYM_SCHEME ret = new TPMS_NULL_ASYM_SCHEME();
        InByteBuf buf = new InByteBuf(x);
        ret.initFromTpm(buf);
        if (buf.bytesRemaining()!=0)
            throw new AssertionError("bytes remaining in buffer after object was de-serialized");
        return ret;
    }

    public static TPMS_NULL_ASYM_SCHEME fromTpm (InByteBuf buf) 
    {
        TPMS_NULL_ASYM_SCHEME ret = new TPMS_NULL_ASYM_SCHEME();
        ret.initFromTpm(buf);
        return ret;
    }

    @Override
    public String toString()
    {
        TpmStructurePrinter _p = new TpmStructurePrinter("TPMS_NULL_ASYM_SCHEME");
        toStringInternal(_p, 1);
        _p.endStruct();
        return _p.toString();
    }

    @Override
    public void toStringInternal(TpmStructurePrinter _p, int d)
    {
    }
}

//<<<

