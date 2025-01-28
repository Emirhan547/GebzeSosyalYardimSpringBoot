import React, { useEffect, useState } from 'react';
import KisiTemelService from './services/KisiTemelService';

function App() {
  const [kisiler, setKisiler] = useState([]);
  const [newKisi, setNewKisi] = useState({ ad: '', soyad: '' }); // Yeni kişi için form

  // Tüm kişileri yükle
  useEffect(() => {
    KisiTemelService.getAll()
      .then((data) => setKisiler(data))
      .catch((error) => console.error("Kişiler yüklenirken hata oluştu:", error));
  }, []);

  // Yeni kişi ekleme
  const handleCreate = () => {
    KisiTemelService.create(newKisi)
      .then((createdKisi) => {
        setKisiler([...kisiler, createdKisi]);
        setNewKisi({ ad: '', soyad: '' }); // Formu sıfırla
      })
      .catch((error) => console.error("Kişi eklenirken hata oluştu:", error));
  };

  // Kişi silme
  const handleDelete = (id) => {
    KisiTemelService.delete(id)
      .then(() => setKisiler(kisiler.filter((kisi) => kisi.id !== id)))
      .catch((error) => console.error("Kişi silinirken hata oluştu:", error));
  };

  return (
    <div>
      <h1>Kişiler Listesi</h1>
      <ul>
        {kisiler.map((kisi) => (
          <li key={kisi.id}>
            {kisi.ad} {kisi.soyad}
            <button onClick={() => handleDelete(kisi.id)}>Sil</button>
          </li>
        ))}
      </ul>

      <h2>Yeni Kişi Ekle</h2>
      <input
        type="text"
        placeholder="Ad"
        value={newKisi.ad}
        onChange={(e) => setNewKisi({ ...newKisi, ad: e.target.value })}
      />
      <input
        type="text"
        placeholder="Soyad"
        value={newKisi.soyad}
        onChange={(e) => setNewKisi({ ...newKisi, soyad: e.target.value })}
      />
      <button onClick={handleCreate}>Ekle</button>
    </div>
  );
}

export default App;
