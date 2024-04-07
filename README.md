<h4>Если пишет ошибку "org.bukkit.plugin.InvalidPluginException: java.lang.UnsupportedClassVersionError: mrfix1033/uuidgetter/UUIDGetter has been compiled by a more recent version of the Java Runtime (class file version 61.0), this version of the Java Runtime only recognizes class file versions up to 52.0", то добавьте флаг:</h4>
<ul>
  <li>Для Purpur: -DPurpur.IgnoreJavaVersion=true</li>
  <li>Для других ядер: -DPaper.IgnoreJavaVersion=true</li>
</ul>
Возможно, будет пофикшено. А может и нет.
