// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scala.meta.internal.semanticdb

object SemanticdbProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_]] = Seq(
    scala.meta.internal.semanticdb.TextDocuments,
    scala.meta.internal.semanticdb.TextDocument,
    scala.meta.internal.semanticdb.Range,
    scala.meta.internal.semanticdb.Location,
    scala.meta.internal.semanticdb.Scope,
    scala.meta.internal.semanticdb.TypeMessage,
    scala.meta.internal.semanticdb.TypeRef,
    scala.meta.internal.semanticdb.SingleType,
    scala.meta.internal.semanticdb.ThisType,
    scala.meta.internal.semanticdb.SuperType,
    scala.meta.internal.semanticdb.ConstantType,
    scala.meta.internal.semanticdb.IntersectionType,
    scala.meta.internal.semanticdb.UnionType,
    scala.meta.internal.semanticdb.WithType,
    scala.meta.internal.semanticdb.StructuralType,
    scala.meta.internal.semanticdb.AnnotatedType,
    scala.meta.internal.semanticdb.ExistentialType,
    scala.meta.internal.semanticdb.UniversalType,
    scala.meta.internal.semanticdb.ByNameType,
    scala.meta.internal.semanticdb.RepeatedType,
    scala.meta.internal.semanticdb.ConstantMessage,
    scala.meta.internal.semanticdb.UnitConstant,
    scala.meta.internal.semanticdb.BooleanConstant,
    scala.meta.internal.semanticdb.ByteConstant,
    scala.meta.internal.semanticdb.ShortConstant,
    scala.meta.internal.semanticdb.CharConstant,
    scala.meta.internal.semanticdb.IntConstant,
    scala.meta.internal.semanticdb.LongConstant,
    scala.meta.internal.semanticdb.FloatConstant,
    scala.meta.internal.semanticdb.DoubleConstant,
    scala.meta.internal.semanticdb.StringConstant,
    scala.meta.internal.semanticdb.NullConstant,
    scala.meta.internal.semanticdb.SignatureMessage,
    scala.meta.internal.semanticdb.ClassSignature,
    scala.meta.internal.semanticdb.MethodSignature,
    scala.meta.internal.semanticdb.TypeSignature,
    scala.meta.internal.semanticdb.ValueSignature,
    scala.meta.internal.semanticdb.SymbolInformation,
    scala.meta.internal.semanticdb.Annotation,
    scala.meta.internal.semanticdb.Accessibility,
    scala.meta.internal.semanticdb.SymbolOccurrence,
    scala.meta.internal.semanticdb.Diagnostic,
    scala.meta.internal.semanticdb.Synthetic
  )
  private lazy val ProtoBytes: Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.Seq(
  """CiZzZW1hbnRpY2RiL3NlbWFudGljZGIvc2VtYW50aWNkYi5wcm90bxIec2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiI
  lsKDVRleHREb2N1bWVudHMSSgoJZG9jdW1lbnRzGAEgAygLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlRleHREb
  2N1bWVudFIJZG9jdW1lbnRzIpIECgxUZXh0RG9jdW1lbnQSPgoGc2NoZW1hGAEgASgOMiYuc2NhbGEubWV0YS5pbnRlcm5hbC5zZ
  W1hbnRpY2RiLlNjaGVtYVIGc2NoZW1hEhAKA3VyaRgCIAEoCVIDdXJpEhIKBHRleHQYAyABKAlSBHRleHQSEAoDbWQ1GAsgASgJU
  gNtZDUSRAoIbGFuZ3VhZ2UYCiABKA4yKC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuTGFuZ3VhZ2VSCGxhbmd1YWdlE
  ksKB3N5bWJvbHMYBSADKAsyMS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3ltYm9sSW5mb3JtYXRpb25SB3N5bWJvb
  HMSUgoLb2NjdXJyZW5jZXMYBiADKAsyMC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3ltYm9sT2NjdXJyZW5jZVILb
  2NjdXJyZW5jZXMSTAoLZGlhZ25vc3RpY3MYByADKAsyKi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuRGlhZ25vc3RpY
  1ILZGlhZ25vc3RpY3MSSQoKc3ludGhldGljcxgIIAMoCzIpLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TeW50aGV0a
  WNSCnN5bnRoZXRpY3NKBAgEEAVKBAgJEAoijwEKBVJhbmdlEh0KCnN0YXJ0X2xpbmUYASABKAVSCXN0YXJ0TGluZRInCg9zdGFyd
  F9jaGFyYWN0ZXIYAiABKAVSDnN0YXJ0Q2hhcmFjdGVyEhkKCGVuZF9saW5lGAMgASgFUgdlbmRMaW5lEiMKDWVuZF9jaGFyYWN0Z
  XIYBCABKAVSDGVuZENoYXJhY3RlciJZCghMb2NhdGlvbhIQCgN1cmkYASABKAlSA3VyaRI7CgVyYW5nZRgCIAEoCzIlLnNjYWxhL
  m1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5SYW5nZVIFcmFuZ2UidAoFU2NvcGUSGgoIc3ltbGlua3MYASADKAlSCHN5bWxpbmtzE
  k8KCWhhcmRsaW5rcxgCIAMoCzIxLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TeW1ib2xJbmZvcm1hdGlvblIJaGFyZ
  GxpbmtzIsAJCgRUeXBlEkMKB3R5cGVSZWYYAiABKAsyJy5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVJlZkgAU
  gd0eXBlUmVmEkwKCnNpbmdsZVR5cGUYFCABKAsyKi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU2luZ2xlVHlwZUgAU
  gpzaW5nbGVUeXBlEkYKCHRoaXNUeXBlGBUgASgLMiguc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlRoaXNUeXBlSABSC
  HRoaXNUeXBlEkkKCXN1cGVyVHlwZRgWIAEoCzIpLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TdXBlclR5cGVIAFIJc
  3VwZXJUeXBlElIKDGNvbnN0YW50VHlwZRgXIAEoCzIsLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5Db25zdGFudFR5c
  GVIAFIMY29uc3RhbnRUeXBlEl4KEGludGVyc2VjdGlvblR5cGUYESABKAsyMC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZ
  GIuSW50ZXJzZWN0aW9uVHlwZUgAUhBpbnRlcnNlY3Rpb25UeXBlEkkKCXVuaW9uVHlwZRgSIAEoCzIpLnNjYWxhLm1ldGEuaW50Z
  XJuYWwuc2VtYW50aWNkYi5VbmlvblR5cGVIAFIJdW5pb25UeXBlEkYKCHdpdGhUeXBlGBMgASgLMiguc2NhbGEubWV0YS5pbnRlc
  m5hbC5zZW1hbnRpY2RiLldpdGhUeXBlSABSCHdpdGhUeXBlElgKDnN0cnVjdHVyYWxUeXBlGAcgASgLMi4uc2NhbGEubWV0YS5pb
  nRlcm5hbC5zZW1hbnRpY2RiLlN0cnVjdHVyYWxUeXBlSABSDnN0cnVjdHVyYWxUeXBlElUKDWFubm90YXRlZFR5cGUYCCABKAsyL
  S5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuQW5ub3RhdGVkVHlwZUgAUg1hbm5vdGF0ZWRUeXBlElsKD2V4aXN0ZW50a
  WFsVHlwZRgJIAEoCzIvLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5FeGlzdGVudGlhbFR5cGVIAFIPZXhpc3RlbnRpY
  WxUeXBlElUKDXVuaXZlcnNhbFR5cGUYCiABKAsyLS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVW5pdmVyc2FsVHlwZ
  UgAUg11bml2ZXJzYWxUeXBlEkwKCmJ5TmFtZVR5cGUYDSABKAsyKi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuQnlOY
  W1lVHlwZUgAUgpieU5hbWVUeXBlElIKDHJlcGVhdGVkVHlwZRgOIAEoCzIsLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkY
  i5SZXBlYXRlZFR5cGVIAFIMcmVwZWF0ZWRUeXBlQg4KDHNlYWxlZF92YWx1ZUoECAEQAkoECAMQBEoECAQQBUoECAUQBkoECAYQB
  0oECAsQDEoECAwQDUoECA8QEEoECBAQESKsAQoHVHlwZVJlZhI8CgZwcmVmaXgYASABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsL
  nNlbWFudGljZGIuVHlwZVIGcHJlZml4EhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sEksKDnR5cGVfYXJndW1lbnRzGAMgAygLMiQuc
  2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSDXR5cGVBcmd1bWVudHMiYgoKU2luZ2xlVHlwZRI8CgZwcmVmaXgYA
  SABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIGcHJlZml4EhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sI
  iIKCFRoaXNUeXBlEhYKBnN5bWJvbBgBIAEoCVIGc3ltYm9sImEKCVN1cGVyVHlwZRI8CgZwcmVmaXgYASABKAsyJC5zY2FsYS5tZ
  XRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIGcHJlZml4EhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sIlQKDENvbnN0YW50VHlwZ
  RJECghjb25zdGFudBgBIAEoCzIoLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5Db25zdGFudFIIY29uc3RhbnQiTgoQS
  W50ZXJzZWN0aW9uVHlwZRI6CgV0eXBlcxgBIAMoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgV0eXBlc
  yJHCglVbmlvblR5cGUSOgoFdHlwZXMYASADKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIFdHlwZXMiR
  goIV2l0aFR5cGUSOgoFdHlwZXMYASADKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIFdHlwZXMipQEKD
  lN0cnVjdHVyYWxUeXBlEjYKA3RwZRgEIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgN0cGUSSQoMZ
  GVjbGFyYXRpb25zGAUgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUgxkZWNsYXJhdGlvbnNKBAgBE
  AJKBAgCEANKBAgDEAQimwEKDUFubm90YXRlZFR5cGUSTAoLYW5ub3RhdGlvbnMYAyADKAsyKi5zY2FsYS5tZXRhLmludGVybmFsL
  nNlbWFudGljZGIuQW5ub3RhdGlvblILYW5ub3RhdGlvbnMSNgoDdHBlGAEgASgLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hb
  nRpY2RiLlR5cGVSA3RwZUoECAIQAyKaAQoPRXhpc3RlbnRpYWxUeXBlEjYKA3RwZRgBIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuY
  Wwuc2VtYW50aWNkYi5UeXBlUgN0cGUSSQoMZGVjbGFyYXRpb25zGAMgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY
  2RiLlNjb3BlUgxkZWNsYXJhdGlvbnNKBAgCEAMinQEKDVVuaXZlcnNhbFR5cGUSTgoPdHlwZV9wYXJhbWV0ZXJzGAMgASgLMiUuc
  2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUg50eXBlUGFyYW1ldGVycxI2CgN0cGUYAiABKAsyJC5zY2FsYS5tZ
  XRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIDdHBlSgQIARACIkQKCkJ5TmFtZVR5cGUSNgoDdHBlGAEgASgLMiQuc2NhbGEub
  WV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSA3RwZSJGCgxSZXBlYXRlZFR5cGUSNgoDdHBlGAEgASgLMiQuc2NhbGEubWV0Y
  S5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSA3RwZSLOBwoIQ29uc3RhbnQSUgoMdW5pdENvbnN0YW50GAEgASgLMiwuc2NhbGEub
  WV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlVuaXRDb25zdGFudEgAUgx1bml0Q29uc3RhbnQSWwoPYm9vbGVhbkNvbnN0YW50GAIgA
  SgLMi8uc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkJvb2xlYW5Db25zdGFudEgAUg9ib29sZWFuQ29uc3RhbnQSUgoMY
  nl0ZUNvbnN0YW50GAMgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkJ5dGVDb25zdGFudEgAUgxieXRlQ29uc
  3RhbnQSVQoNc2hvcnRDb25zdGFudBgEIAEoCzItLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TaG9ydENvbnN0YW50S
  ABSDXNob3J0Q29uc3RhbnQSUgoMY2hhckNvbnN0YW50GAUgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkNoY
  XJDb25zdGFudEgAUgxjaGFyQ29uc3RhbnQSTwoLaW50Q29uc3RhbnQYBiABKAsyKy5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFud
  GljZGIuSW50Q29uc3RhbnRIAFILaW50Q29uc3RhbnQSUgoMbG9uZ0NvbnN0YW50GAcgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hb
  C5zZW1hbnRpY2RiLkxvbmdDb25zdGFudEgAUgxsb25nQ29uc3RhbnQSVQoNZmxvYXRDb25zdGFudBgIIAEoCzItLnNjYWxhLm1ld
  GEuaW50ZXJuYWwuc2VtYW50aWNkYi5GbG9hdENvbnN0YW50SABSDWZsb2F0Q29uc3RhbnQSWAoOZG91YmxlQ29uc3RhbnQYCSABK
  AsyLi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuRG91YmxlQ29uc3RhbnRIAFIOZG91YmxlQ29uc3RhbnQSWAoOc3Rya
  W5nQ29uc3RhbnQYCiABKAsyLi5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3RyaW5nQ29uc3RhbnRIAFIOc3RyaW5nQ
  29uc3RhbnQSUgoMbnVsbENvbnN0YW50GAsgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLk51bGxDb25zdGFud
  EgAUgxudWxsQ29uc3RhbnRCDgoMc2VhbGVkX3ZhbHVlIg4KDFVuaXRDb25zdGFudCInCg9Cb29sZWFuQ29uc3RhbnQSFAoFdmFsd
  WUYASABKAhSBXZhbHVlIiQKDEJ5dGVDb25zdGFudBIUCgV2YWx1ZRgBIAEoBVIFdmFsdWUiJQoNU2hvcnRDb25zdGFudBIUCgV2Y
  Wx1ZRgBIAEoBVIFdmFsdWUiJAoMQ2hhckNvbnN0YW50EhQKBXZhbHVlGAEgASgFUgV2YWx1ZSIjCgtJbnRDb25zdGFudBIUCgV2Y
  Wx1ZRgBIAEoBVIFdmFsdWUiJAoMTG9uZ0NvbnN0YW50EhQKBXZhbHVlGAEgASgDUgV2YWx1ZSIlCg1GbG9hdENvbnN0YW50EhQKB
  XZhbHVlGAEgASgCUgV2YWx1ZSImCg5Eb3VibGVDb25zdGFudBIUCgV2YWx1ZRgBIAEoAVIFdmFsdWUiJgoOU3RyaW5nQ29uc3Rhb
  nQSFAoFdmFsdWUYASABKAlSBXZhbHVlIg4KDE51bGxDb25zdGFudCKDAwoJU2lnbmF0dXJlElgKDmNsYXNzU2lnbmF0dXJlGAEgA
  SgLMi4uc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkNsYXNzU2lnbmF0dXJlSABSDmNsYXNzU2lnbmF0dXJlElsKD21ld
  GhvZFNpZ25hdHVyZRgCIAEoCzIvLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5NZXRob2RTaWduYXR1cmVIAFIPbWV0a
  G9kU2lnbmF0dXJlElUKDXR5cGVTaWduYXR1cmUYAyABKAsyLS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVNpZ
  25hdHVyZUgAUg10eXBlU2lnbmF0dXJlElgKDnZhbHVlU2lnbmF0dXJlGAQgASgLMi4uc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hb
  nRpY2RiLlZhbHVlU2lnbmF0dXJlSABSDnZhbHVlU2lnbmF0dXJlQg4KDHNlYWxlZF92YWx1ZSLrAQoOQ2xhc3NTaWduYXR1cmUST
  goPdHlwZV9wYXJhbWV0ZXJzGAEgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUg50eXBlUGFyYW1ld
  GVycxI+CgdwYXJlbnRzGAIgAygLMiQuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlR5cGVSB3BhcmVudHMSSQoMZGVjb
  GFyYXRpb25zGAMgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlNjb3BlUgxkZWNsYXJhdGlvbnMi9wEKD01ld
  GhvZFNpZ25hdHVyZRJOCg90eXBlX3BhcmFtZXRlcnMYASABKAsyJS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU2Nvc
  GVSDnR5cGVQYXJhbWV0ZXJzEk0KDnBhcmFtZXRlckxpc3RzGAIgAygLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiL
  lNjb3BlUg5wYXJhbWV0ZXJMaXN0cxJFCgtyZXR1cm5fdHlwZRgDIAEoCzIkLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkY
  i5UeXBlUgpyZXR1cm5UeXBlIu0BCg1UeXBlU2lnbmF0dXJlEk4KD3R5cGVfcGFyYW1ldGVycxgBIAEoCzIlLnNjYWxhLm1ldGEua
  W50ZXJuYWwuc2VtYW50aWNkYi5TY29wZVIOdHlwZVBhcmFtZXRlcnMSRQoLbG93ZXJfYm91bmQYAiABKAsyJC5zY2FsYS5tZXRhL
  mludGVybmFsLnNlbWFudGljZGIuVHlwZVIKbG93ZXJCb3VuZBJFCgt1cHBlcl9ib3VuZBgDIAEoCzIkLnNjYWxhLm1ldGEuaW50Z
  XJuYWwuc2VtYW50aWNkYi5UeXBlUgp1cHBlckJvdW5kIkgKDlZhbHVlU2lnbmF0dXJlEjYKA3RwZRgBIAEoCzIkLnNjYWxhLm1ld
  GEuaW50ZXJuYWwuc2VtYW50aWNkYi5UeXBlUgN0cGUi+QcKEVN5bWJvbEluZm9ybWF0aW9uEhYKBnN5bWJvbBgBIAEoCVIGc3ltY
  m9sEkQKCGxhbmd1YWdlGBAgASgOMiguc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkxhbmd1YWdlUghsYW5ndWFnZRJKC
  gRraW5kGAMgASgOMjYuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlN5bWJvbEluZm9ybWF0aW9uLktpbmRSBGtpbmQSH
  goKcHJvcGVydGllcxgEIAEoBVIKcHJvcGVydGllcxISCgRuYW1lGAUgASgJUgRuYW1lEkcKCXNpZ25hdHVyZRgRIAEoCzIpLnNjY
  WxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5TaWduYXR1cmVSCXNpZ25hdHVyZRJMCgthbm5vdGF0aW9ucxgNIAMoCzIqLnNjY
  WxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5Bbm5vdGF0aW9uUgthbm5vdGF0aW9ucxJTCg1hY2Nlc3NpYmlsaXR5GA4gASgLM
  i0uc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLkFjY2Vzc2liaWxpdHlSDWFjY2Vzc2liaWxpdHkijQIKBEtpbmQSEAoMV
  U5LTk9XTl9LSU5EEAASCQoFTE9DQUwQExIJCgVGSUVMRBAUEgoKBk1FVEhPRBADEg8KC0NPTlNUUlVDVE9SEBUSCQoFTUFDUk8QB
  hIICgRUWVBFEAcSDQoJUEFSQU1FVEVSEAgSEgoOU0VMRl9QQVJBTUVURVIQERISCg5UWVBFX1BBUkFNRVRFUhAJEgoKBk9CSkVDV
  BAKEgsKB1BBQ0tBR0UQCxISCg5QQUNLQUdFX09CSkVDVBAMEgkKBUNMQVNTEA0SCQoFVFJBSVQQDhINCglJTlRFUkZBQ0UQEiIEC
  AEQASIECAIQAiIECAQQBCIECAUQBSIECA8QDyIECBAQECLTAQoIUHJvcGVydHkSFAoQVU5LTk9XTl9QUk9QRVJUWRAAEgwKCEFCU
  1RSQUNUEAQSCQoFRklOQUwQCBIKCgZTRUFMRUQQEBIMCghJTVBMSUNJVBAgEggKBExBWlkQQBIJCgRDQVNFEIABEg4KCUNPVkFSS
  UFOVBCAAhISCg1DT05UUkFWQVJJQU5UEIAEEggKA1ZBTBCACBIICgNWQVIQgBASCwoGU1RBVElDEIAgEgwKB1BSSU1BUlkQgEASC
  goERU5VTRCAgAEiBAgBEAEiBAgCEAJKBAgCEANKBAgGEAdKBAgHEAhKBAgIEAlKBAgJEApKBAgKEAtKBAgLEAxKBAgMEA1KBAgPE
  BAiRAoKQW5ub3RhdGlvbhI2CgN0cGUYASABKAsyJC5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuVHlwZVIDdHBlIocCC
  g1BY2Nlc3NpYmlsaXR5EkMKA3RhZxgBIAEoDjIxLnNjYWxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5BY2Nlc3NpYmlsaXR5L
  lRhZ1IDdGFnEhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sIpgBCgNUYWcSGQoVVU5LTk9XTl9BQ0NFU1NJQklMSVRZEAASCwoHUFJJV
  kFURRABEhAKDFBSSVZBVEVfVEhJUxACEhIKDlBSSVZBVEVfV0lUSElOEAMSDQoJUFJPVEVDVEVEEAQSEgoOUFJPVEVDVEVEX1RIS
  VMQBRIUChBQUk9URUNURURfV0lUSElOEAYSCgoGUFVCTElDEAci6wEKEFN5bWJvbE9jY3VycmVuY2USOwoFcmFuZ2UYASABKAsyJ
  S5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuUmFuZ2VSBXJhbmdlEhYKBnN5bWJvbBgCIAEoCVIGc3ltYm9sEkkKBHJvb
  GUYAyABKA4yNS5zY2FsYS5tZXRhLmludGVybmFsLnNlbWFudGljZGIuU3ltYm9sT2NjdXJyZW5jZS5Sb2xlUgRyb2xlIjcKBFJvb
  GUSEAoMVU5LTk9XTl9ST0xFEAASDQoJUkVGRVJFTkNFEAESDgoKREVGSU5JVElPThACIokCCgpEaWFnbm9zdGljEjsKBXJhbmdlG
  AEgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlJhbmdlUgVyYW5nZRJPCghzZXZlcml0eRgCIAEoDjIzLnNjY
  WxhLm1ldGEuaW50ZXJuYWwuc2VtYW50aWNkYi5EaWFnbm9zdGljLlNldmVyaXR5UghzZXZlcml0eRIYCgdtZXNzYWdlGAMgASgJU
  gdtZXNzYWdlIlMKCFNldmVyaXR5EhQKEFVOS05PV05fU0VWRVJJVFkQABIJCgVFUlJPUhABEgsKB1dBUk5JTkcQAhIPCgtJTkZPU
  k1BVElPThADEggKBEhJTlQQBCKKAQoJU3ludGhldGljEjsKBXJhbmdlGAEgASgLMiUuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hb
  nRpY2RiLlJhbmdlUgVyYW5nZRJACgR0ZXh0GAIgASgLMiwuc2NhbGEubWV0YS5pbnRlcm5hbC5zZW1hbnRpY2RiLlRleHREb2N1b
  WVudFIEdGV4dCo2CgZTY2hlbWESCgoGTEVHQUNZEAASDwoLU0VNQU5USUNEQjMQAxIPCgtTRU1BTlRJQ0RCNBAEKjUKCExhbmd1Y
  WdlEhQKEFVOS05PV05fTEFOR1VBR0UQABIJCgVTQ0FMQRABEggKBEpBVkEQAmIGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}