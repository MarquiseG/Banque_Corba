package corbaBanque;

/**
* corbaBanque/IBanqueRemoteHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Banque.idl
* dimanche 10 septembre 2017 10 h 19 CEST
*/

public final class IBanqueRemoteHolder implements org.omg.CORBA.portable.Streamable
{
  public corbaBanque.IBanqueRemote value = null;

  public IBanqueRemoteHolder ()
  {
  }

  public IBanqueRemoteHolder (corbaBanque.IBanqueRemote initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = corbaBanque.IBanqueRemoteHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    corbaBanque.IBanqueRemoteHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return corbaBanque.IBanqueRemoteHelper.type ();
  }

}